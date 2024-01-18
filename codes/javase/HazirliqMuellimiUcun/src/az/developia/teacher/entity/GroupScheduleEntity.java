package az.developia.teacher.entity;

 
import java.util.Objects;

 
import java.time.LocalDateTime;
import java.util.Objects;



 
public class GroupScheduleEntity {
	private Integer id;
	private Integer groupId;
	private Integer day;
	private LocalDateTime hour;

	public GroupScheduleEntity(Integer id, Integer groupId, Integer day) {
		super();
		this.id = id;
		this.groupId = groupId;
		this.day = day;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public LocalDateTime getHour() {
		return hour;
	}

	public void setHour(LocalDateTime hour) {
		this.hour = hour;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, groupId, hour, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroupScheduleEntity other = (GroupScheduleEntity) obj;
		return Objects.equals(day, other.day) && Objects.equals(groupId, other.groupId)
				&& Objects.equals(hour, other.hour) && Objects.equals(id, other.id);
	}
 
}



