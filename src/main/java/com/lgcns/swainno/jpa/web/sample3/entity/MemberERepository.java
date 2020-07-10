/***
 * @name : Member Repository
 * @path : com.lgcns.swainno.jpa.web.sample3.entity.MemberERepository.java
 * @description : member entity에 대한  데이터 조작을 담당하는 Repository 클래스
 *                interface로 생성하며, JpaRepository를 extends하여 데이터 조작을 수행. JpaRepository의 값은 매핑할 entity와 id의 타입이다.
 */
package com.lgcns.swainno.jpa.web.sample3.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberERepository extends JpaRepository<MemberE, Long>{

}
