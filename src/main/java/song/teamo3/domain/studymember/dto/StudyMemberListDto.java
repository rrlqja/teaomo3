package song.teamo3.domain.studymember.dto;

import lombok.Data;
import song.teamo3.domain.studymember.entity.StudyMember;

@Data
public class StudyMemberListDto {
    private Long id;
    private String memberName;

    public StudyMemberListDto(StudyMember studyMember) {
        this.id = studyMember.getId();
        this.memberName = studyMember.getUser().getName();
    }
}
