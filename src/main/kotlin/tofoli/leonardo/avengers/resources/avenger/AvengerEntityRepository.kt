package tofoli.leonardo.avengers.resources.avenger

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AvengerEntityRepository : JpaRepository<AvengerEntity, Long> {}