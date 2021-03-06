package CH6_JDBC.page_309_spring_jdbc_rowmapperPLUSlambda;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class JdbcContactDao implements ContactDao, InitializingBean
{
    private DataSource dataSource;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public String findLastNameById(Long id) {
        String sql = "select last_name from contact where id = :contactId";

        Map<String, Object> namedParameters = new HashMap<String, Object>();
        namedParameters.put("contactId", id);

        return namedParameterJdbcTemplate.queryForObject(sql,
                namedParameters, String.class);
    }

    @Override
    public List<Contact> findAll() {
        String sql = "select id, first_name, last_name, birth_date from contact";
//        return namedParameterJdbcTemplate.query(sql, new ContactMapper()); //ДО JDK 8
        return namedParameterJdbcTemplate.query(sql, (rs, rowNum) -> {
            Contact contact = new Contact();
            contact.setId(rs.getLong("id"));
            contact.setFirstName(rs.getString("first_name"));
            contact.setLastName(rs.getString("last_name"));
            contact.setBirthDate(rs.getDate("birth_date"));

            return contact;
        });
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;

        NamedParameterJdbcTemplate namedParameterJdbcTemplate =
                new NamedParameterJdbcTemplate(dataSource);

        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (dataSource == null) {
            throw new BeanCreationException("Must set dataSource on ContactDao");
        }

        if (namedParameterJdbcTemplate == null) {
            throw new BeanCreationException("Null NamedParameterJdbcTemplate on ContactDao");
        }
    }

    private static final class ContactMapper implements RowMapper<Contact>
    {
        @Override
        public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
            Contact contact = new Contact();
            contact.setId(rs.getLong("id"));
            contact.setFirstName(rs.getString("first_name"));
            contact.setLastName(rs.getString("last_name"));
            contact.setBirthDate(rs.getDate("birth_date"));

            return contact;
        }
    }
}
