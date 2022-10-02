package kttkpm15b.DemoJPA.controller;

import kttkpm15b.DemoJPA.model.ChuyenBay;
import kttkpm15b.DemoJPA.model.MayBay;
import kttkpm15b.DemoJPA.model.NhanVien;
import kttkpm15b.DemoJPA.service.ChuyenBayService;
import kttkpm15b.DemoJPA.service.MayBayService;
import kttkpm15b.DemoJPA.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    MayBayService mayBayService;
    @Autowired
    ChuyenBayService chuyenBayService;

    @Autowired
    NhanVienService nhanVienService;
//    @ResponseBody
    @GetMapping("/")
    public String Main() {
        return "<h1><a href='/1'>cau 1</a></h1>" +
            "<h1><a href='/2'>cau 2</a></h1>" +
            "<h1><a href='/3'>cau 3</a></h1>" +
            "<h1><a href='/4'>cau 4</a></h1>" +
            "<h1><a href='/5'>cau 5</a></h1>" +
            "<h1><a href='/6'>cau 6</a></h1>" +
            "<h1><a href='/7'>cau 7</a></h1>" +
            "<h1><a href='/8'>cau 8</a></h1>" +
            "<h1><a href='/9'>cau 9</a></h1>" +
            "<h1><a href='/10'>cau 10</a></h1>";
    }

    @GetMapping("/1")
    public List<ChuyenBay> BaiTap1() {
        List<ChuyenBay> chuyenbays = chuyenBayService.findByGa("DAD");
        chuyenbays.forEach((item) -> {
            System.out.println(item);
        });
        return chuyenbays;
    }

    @GetMapping("/2")
    public List<MayBay> BaiTap2() {
        List<MayBay> maybays = mayBayService.findByTamBay(10000);
        maybays.forEach((item) -> {
            System.out.println(item);
        });
        return maybays;
    }

    @GetMapping("/3")
    public List<NhanVien> BaiTap3() {
        List<NhanVien> nhanviens = nhanVienService.findByLuongLessThan(10000);
        nhanviens.forEach((item) -> {
            System.out.println(item);
        });
        return nhanviens;
    }

    @GetMapping("/4")
    public List<ChuyenBay> BaiTap4() {
        List<ChuyenBay> chuyenbays = chuyenBayService.findByDoDai(10000, 8000);
        chuyenbays.forEach((item) -> {
            System.out.println(item);
        });
        return chuyenbays;
    }

    @GetMapping("/5")
    public List<ChuyenBay> BaiTap5() {
        List<ChuyenBay> chuyenbays = chuyenBayService.findByGaDenDi("SGN", "BMV");
        chuyenbays.forEach((item) -> {
            System.out.println(item);
        });
        return chuyenbays;
    }

    @GetMapping("/6")
    public String BaiTap6() {
        int chuyenbays = chuyenBayService.countByGaDi("SGN");
        return "co " + chuyenbays + "chuyen bay di Sai Gon";
    }

    @GetMapping("/7")
    public String BaiTap7() {
        List<MayBay> mayBays = mayBayService.findByLoai("boeing");
        return "Có" + mayBays.size() +" loại máy báy Boeing";
    }

    @GetMapping("/8")
    public String BaiTap8() {
        double luong = nhanVienService.sumLuong();
        return "Tong Luong Phai Tra Cho NV là: " + luong;
    }

    @GetMapping("/9")
    public String BaiTap9() {
        List<String> nhanviens = nhanVienService.findNVByBoe("boeing");
        String ds_ma = "";
        for (String ma : nhanviens) {
            ds_ma += ", " + ma;
        }
        return ds_ma;
    }

    @GetMapping("/10")
    public List<NhanVien> BaiTap10() {
        List<NhanVien> nhanviens = nhanVienService.findByNVMB("747");
        return nhanviens;
    }
}
