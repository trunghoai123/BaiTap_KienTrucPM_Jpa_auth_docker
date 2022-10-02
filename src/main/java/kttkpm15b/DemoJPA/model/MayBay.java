package kttkpm15b.DemoJPA.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "maybay")
public class MayBay {
    @Id
    @Column(name = "ma_mb")
    private int maMB;

    @Column(name = "loai")
    private String loai;

    @Column(name = "tam_bay")
    private int tamBay;

    @Override
    public String toString() {
        return "maybay{" +
                "ma_mb=" + maMB +
                ", loai='" + loai + '\'' +
                ", tam_bay=" + tamBay +
                '}';
    }
}
