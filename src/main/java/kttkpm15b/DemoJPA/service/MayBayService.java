package kttkpm15b.DemoJPA.service;

import kttkpm15b.DemoJPA.model.MayBay;
import kttkpm15b.DemoJPA.repository.MayBayRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MayBayService {
    private final MayBayRepository mayBayRepository;
    public MayBayService(MayBayRepository mayBayRepository){
        this.mayBayRepository = mayBayRepository;
    }
    public List<MayBay> findByTamBay(int tambay){
        return mayBayRepository.findByTamBayGreaterThan(tambay);
    }
    public List<MayBay> findByLoai(String loai){
        return mayBayRepository.findByLoai(loai);
    }
    public List<String> findMBbyTen(String ten){
        return mayBayRepository.findMBByTen(ten);
    }
    public int countByNVMB(String ma_nv){
        return mayBayRepository.countMBByNV(ma_nv);
    }
}
