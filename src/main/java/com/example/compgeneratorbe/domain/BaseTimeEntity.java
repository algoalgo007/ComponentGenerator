//package com.example.compgeneratorbe.domain;
//
//import jakarta.persistence.EntityListeners;
//import jakarta.persistence.MappedSuperclass;
//import lombok.Getter;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import java.time.LocalDateTime;
//
//@Gett
//
// er
//@MappedSuperclass // JPA Entity 클래스들이 BaseTimeEntity를 상속할 경우 필드(createdDate, modifiedDate)들도 칼럼으로 인식하도록 합니다.
//@EntityListeners(AuditingEntityListener.class)//BaseTimeEntity 클래스에 Auditing 기능을 포함시킵니다.
//public abstract class BaseTimeEntity {
//
//    @CreatedDate//Entity가 생성되어 저장될 때 시간이 자동 저장됩니다.
//    private LocalDateTime createdDate;
//
//    @LastModifiedDate//조회한 Entity의 값을 변경할 때 시간이 자동 저장됩니다.
//    private LocalDateTime modifiedDate;
//
//    //그리고 Posts 클래스가 BaseTimeEntity를 상속받도록 변경합니다.
//}
