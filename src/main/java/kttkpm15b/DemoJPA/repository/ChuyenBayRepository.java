package kttkpm15b.DemoJPA.repository;

import kttkpm15b.DemoJPA.model.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    @Query(nativeQuery = true, value = "select * from chuyenbay where ga_den = :name ")
    public List<ChuyenBay> findbyGa(@Param("name") String name);

    @Query(nativeQuery = true, value = "select * from chuyenbay where do_dai < :max and do_dai > :min")
    public List<ChuyenBay> findByDoDai(@Param("max") int max,
                                       @Param("min") int min);

    @Query(nativeQuery = true, value = "select * from chuyenbay where ga_di = :ga_di and ga_den = :ga_den")
    public List<ChuyenBay> findByGaDiDen(@Param("ga_di") String gaDi,
                                         @Param("ga_den") String gaDen);

    @Query(nativeQuery = true, value = "select count(ma_cb) from chuyenbay where ga_di = :ga_di")
    public int countByGaDi(@Param("ga_di") String gaDi);

    @Query(nativeQuery = true, value = "select * from chuyenbay where timediff(gio_di,:time) < 0")
    public List<ChuyenBay> findByTime(@Param("time") String time);

    @Query(nativeQuery = true, value = "select * from chuyenbay where ga_di = :ga_di and timediff(gio_di,'12:00:00') < 0")
    public List<ChuyenBay> findByGaAndTime(@Param("ga_di") String gaDi);
}
