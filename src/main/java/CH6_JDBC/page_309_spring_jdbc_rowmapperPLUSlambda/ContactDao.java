package CH6_JDBC.page_309_spring_jdbc_rowmapperPLUSlambda;

import java.util.List;

public interface ContactDao
{
    List<Contact> findAll();

    String findLastNameById(Long id);
}
