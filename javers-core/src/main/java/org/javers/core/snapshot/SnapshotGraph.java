package org.javers.core.snapshot;

import org.javers.core.diff.ObjectGraph;
import org.javers.core.graph.ObjectNode;
import org.javers.core.metamodel.object.CdoSnapshot;

import java.util.Collections;
import java.util.Set;

/**
 * @author bartosz walacik
 */
class SnapshotGraph extends ObjectGraph<CdoSnapshot> {
    static SnapshotGraph EMPTY = new SnapshotGraph(Collections.emptySet());

    SnapshotGraph(Set<ObjectNode> snapshots) {
        super(snapshots);
    }
}
