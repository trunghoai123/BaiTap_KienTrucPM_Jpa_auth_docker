package kttkpm15b.DemoJPA.service;

import kttkpm15b.DemoJPA.model.NhanVien;
import kttkpm15b.DemoJPA.repository.NhanVienRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhanVienService {
    private NhanVienRepository nhanVienRepository;
    public NhanVienService(NhanVienRepository nhanVienRepository){
        this.nhanVienRepository = nhanVienRepository;
    }
    public List<NhanVien> findByLuongGreateThan(int luongcb){
        return nhanVienRepository.findLuongGreateThan(luongcb);
    }
    public List<NhanVien> findByLuongLessThan(int luongcb){
        return nhanVienRepository.findLuongLessThan(luongcb);
    }
    public float sumLuong() {
        return nhanVienRepository.sumLuong();
    }
    public List<String> findNVByBoe(String loai){
        return nhanVienRepository.findMaNVByBoe(loai);
    }

    public List<NhanVien> findByNVMB(String loai){
        return nhanVienRepository.findNVByMB(loai);
    }
    public List<NhanVien> findByNotPC(){
        return nhanVienRepository.findByNotPC();
    }
}
