package CH6_JDBC.page_300_spring_jdbc_embedded;

import javax.sql.DataSource;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcContactDao implements ContactDao, InitializingBean
{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    //Динамический метод
    @Override
    public String findFirstNameById(Long id) {
        return jdbcTemplate.queryForObject(
                "select first_name from contact where id = ?",
                new Object[]{id}, String.class);
    }

    //Самый первый при инициализации бина
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;

        /**
         * Start. Spring was invoke this special Translator if detected custom Exception translator
         * page 305
         */
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);

        MySQLErrorCodesTranslator errorTranslator = new MySQLErrorCodesTranslator();

        errorTranslator.setDataSource(dataSource);

        jdbcTemplate.setExceptionTranslator(errorTranslator);

        this.jdbcTemplate = jdbcTemplate;
        /**
         * End. Spring was invoke this special Translator if detected custom Exception translator
         * page 305
         */
    }

    //Проверка после инициализации бина для интерфейса InitializingBean
    public void afterPropertiesSet() throws Exception {
        if (dataSource == null) {
            throw new BeanCreationException("Must set dataSource on ContactDao");
        }

        if (jdbcTemplate == null) {
            throw new BeanCreationException("Null JdbcTemplate on ContactDao");
        }
    }
}
