package uz.oliymahad.oliymahadquroncourse.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.oliymahad.oliymahadquroncourse.audit.Auditable;
import uz.oliymahad.oliymahadquroncourse.entity.enums.Category;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "post")
public class Post extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageUrl;

    private String title;

    private String content;

    private String author;

    @Enumerated(EnumType.ORDINAL)
    private Category category;
}
