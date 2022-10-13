package org.javers.core.protobuf

import org.javers.core.JaversBuilder
import org.javers.core.examples.model.ResourcesOuterClass
import spock.lang.Specification

class ProtobufDiffTest extends Specification {

    def "should calculate diff for Protobufs"(){
        given:
        def javers = JaversBuilder.javers().build()

        when:
        def diff = javers.compare(
                ResourcesOuterClass.TestEntity.getDefaultInstance(),
                ResourcesOuterClass.TestEntity.getDefaultInstance()
        )

        then:
        diff.changes.size() == 0
    }
}
