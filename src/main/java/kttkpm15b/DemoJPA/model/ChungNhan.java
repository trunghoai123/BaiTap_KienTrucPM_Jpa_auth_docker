package kttkpm15b.DemoJPA.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "chungnhan")
public class ChungNhan implements Serializable{
	@Id
	@ManyToOne(optional = false)
	@JoinColumn(name = "ma_nv", referencedColumnName = "ma_nv", insertable = false, updatable = false)
	private NhanVien nhanVien;

	@Id
	@ManyToOne(optional = false)
	@JoinColumn(name = "ma_mb", referencedColumnName = "ma_mb", insertable = false, updatable = false)
	private MayBay mayBay;

}
