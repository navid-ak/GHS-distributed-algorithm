package Events;

import se.sics.kompics.KompicsEvent;

public class JoinMessage implements KompicsEvent {
    public String src;
    public String dst;
    public int edge_weight;
    public String coordinator;
    public int level;
    public String fragmentName;

    public JoinMessage(String src, String dst, int edge_weight, String coordinator, int level, String fragmentName) {
        this.src = src;
        this.dst = dst;
        this.edge_weight = edge_weight;
        this.coordinator = coordinator;
        this.level = level;
        this.fragmentName = fragmentName;
    }
}
