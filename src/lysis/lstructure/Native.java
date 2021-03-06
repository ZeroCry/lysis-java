package lysis.lstructure;

public class Native extends Signature {
	int index_;

    public Native(String name, int index)
    {
    	super(name);
        index_ = index;
    }

    public void setDebugInfo(int tag_id, Tag tag, Argument[] args)
    {
        tag_id_ = (long)tag_id;
        tag_ = tag;
        args_ = args;
    }

    public int index()
    {
        return index_;
    }
}
