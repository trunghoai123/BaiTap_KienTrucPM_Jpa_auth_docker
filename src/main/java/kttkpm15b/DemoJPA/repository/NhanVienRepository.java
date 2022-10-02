package kttkpm15b.DemoJPA.repository;

import kttkpm15b.DemoJPA.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien,String> {
    @Query(nativeQuery = true, value = "select * from nhanvien where luong > :luongcb")
    public List<NhanVien> findLuongGreateThan(@Param("luongcb") int luongcb);
    @Query(nativeQuery = true, value = "select * from nhanvien where luong < :luongcb")
    public List<NhanVien> findLuongLessThan(@Param("luongcb") int luongcb);
    @Query(nativeQuery = true, value = "select sum(luong) from nhanvien")
    public float sumLuong();

    @Query(nativeQuery = true, value = "select ma_nv from chungnhan as nv join maybay as mb on nv.ma_mb = mb.ma_mb where mb.loai like :loai"+"%")
    public List<String> findMaNVByBoe(@Param("loai") String loai);

//    @Query(nativeQuery = true, value = "select nv.ma_nv, nv.ten, nv.luong from nhanvien as nv join chungnhan as cn on nv.ma_nv = cn.ma_nv join maybay as mb on cn.ma_mb = mb.ma_mb where mb.ma_mb = :loai")
//    public List<NhanVien> findNVByMB(@Param("loai") String loai);
//
//    @Query(nativeQuery = true, value = "select * from nhanvien as nv " +
//            "where nv.ma_nv not in (select nv.ma_nv from nhanvien as nv join chungnhan as cn where nv.ma_nv = cn.ma_nv " +
//            "group by nv.ma_nv) ")
//    public List<NhanVien> findByNotPC();
}
