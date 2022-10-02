package kttkpm15b.DemoJPA.repository;

import kttkpm15b.DemoJPA.model.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay,Integer> {
    @Query(nativeQuery = true, value = "select * from maybay where tam_bay > :tambay ")
    public List<MayBay> findByTamBayGreaterThan(@Param("tambay") Integer tambay);

    @Query(nativeQuery = true, value = "select * from maybay where loai like :loaimb"+"%")
    public List<MayBay> findByLoai(@Param("loaimb") String loai);

    @Query(nativeQuery = true, value = "select mb.ma_mb from maybay as mb join chungnhan as cb on mb.ma_mb = cb.ma_mb join nhanvien as nv on nv.ma_nv = cb.ma_nv where nv.ten like :ten"+"%")
    public List<String> findMBByTen(@Param("ten") String ten);

    @Query(nativeQuery = true, value = "select count(mb.ma_mb) from maybay as mb join chungnhan as cn on mb.ma_mb = cn.ma_mb where cn.ma_nv = :ma_nv")
    public int countMBByNV(@Param("ma_nv") String ma_nv);
}
