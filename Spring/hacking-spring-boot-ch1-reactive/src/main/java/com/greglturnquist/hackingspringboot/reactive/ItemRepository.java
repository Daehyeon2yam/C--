package com.greglturnquist.hackingspringboot.reactive;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ItemRepository extends ReactiveCrudRepository<Item, String> {
        //첫번째 제네릭 파라미터는 리포지토리가 저장하고 조회하는 타입을 의미. Item을 저장하고 조회한다는 뜻
        //두번째 파라미터인 String은 저장되는 데이터의 식별자 타입이 String이라는 의미 인터페이스라서 아무런 구현 코드도 포함돼어 있지 않다.

        //부모 인터페이스인 ReactiveCrudRepository에서 상속받는 메소드는 save,saveAll, findById,findAll,findAllById,existById,count
        //deleteById,delete,deleteAll이 있다.
}
