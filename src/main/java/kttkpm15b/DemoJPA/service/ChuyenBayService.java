package kttkpm15b.DemoJPA.service;

import kttkpm15b.DemoJPA.model.ChuyenBay;
import kttkpm15b.DemoJPA.repository.ChuyenBayRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuyenBayService {
    private ChuyenBayRepository chuyenBayRepository;
    public ChuyenBayService(ChuyenBayRepository chuyenBayRepository){
        this.chuyenBayRepository = chuyenBayRepository;
    }
    public List<ChuyenBay> findByGa(String name){
        return chuyenBayRepository.findbyGa(name);
    }
    public List<ChuyenBay> findByDoDai(int max, int min){
        return chuyenBayRepository.findByDoDai(max, min);
    }

    public List<ChuyenBay> findByGaDenDi(String gaDi, String gaDen){
        return chuyenBayRepository.findByGaDiDen(gaDi, gaDen);
    }
    public int countByGaDi(String gaDi){
        return chuyenBayRepository.countByGaDi(gaDi);
    }
    public List<ChuyenBay> findByTime(String time){
        return chuyenBayRepository.findByTime(time);
    }

    public List<ChuyenBay> findByGaAndTime(String gaDi){
        return chuyenBayRepository.findByGaAndTime(gaDi);
    }

}
