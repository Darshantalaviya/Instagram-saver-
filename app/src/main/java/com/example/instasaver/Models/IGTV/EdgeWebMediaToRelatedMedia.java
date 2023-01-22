
package com.example.instasaver.Models.IGTV;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EdgeWebMediaToRelatedMedia {

    @SerializedName("edges")
    @Expose
    private List<Object> edges = null;

    public List<Object> getEdges() {
        return edges;
    }

    public void setEdges(List<Object> edges) {
        this.edges = edges;
    }

}
