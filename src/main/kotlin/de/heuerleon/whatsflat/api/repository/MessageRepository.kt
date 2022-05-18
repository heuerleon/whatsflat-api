package de.heuerleon.whatsflat.api.repository

import de.heuerleon.whatsflat.api.model.Message
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository : JpaRepository<Message, Long>