package CH6_JDBC.page_312_spring_jdbc_resultsetextractor_lambdaPLUSlambda;

import java.util.List;

public interface ContactDao {
    String findLastNameById(Long id);
    List<Contact> findAllWithDetail();
}
