package comit.simsimpulyi.koala.persistence.file

import comit.simsimpulyi.koala.persistence.feed.entity.FeedEntity
import comit.simsimpulyi.koala.persistence.file.entity.FileEntity
import org.springframework.stereotype.Component
import java.util.*

@Component
class FilePersistenceAdapter(
    private val fileRepository: FileRepository
) {

    fun saveFile(filePaths: List<String>, feed: FeedEntity) {
        for (path in filePaths) {
            fileRepository.save(
                FileEntity(
                    path = path,
                    feed = feed
                ))
        }
    }

    fun queryFileList(feedId: UUID) : List<String> {
        return fileRepository.queryPathByFeedId(feedId)
    }
}