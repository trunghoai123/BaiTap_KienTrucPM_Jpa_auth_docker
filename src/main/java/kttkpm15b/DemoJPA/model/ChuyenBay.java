package kttkpm15b.DemoJPA.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
@Entity
@Builder(toBuilder = true)
@Table(name = "chuyenbay")
public class ChuyenBay implements Serializable {
    @Id
    @Column(name = "ma_cb", nullable = false)
    private String maChuyenBay;
    @Column(name = "ga_di")
    private String gaDi;
    @Column(name = "ga_den")
    private String gaDen;
    @Column(name = "do_dai")
    private int doDai;
    @Column(name = "gio_di")
    private LocalDateTime gioDi;
    @Column(name = "gio_den")
    private LocalDateTime gioDen;
    @Column(name = "chi_phi")
    private int chiPhi;
}
