package com.comcast.model.curatedlists;

import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Playlist {

	 private Items[] items;

	    private String totalItems;

	    private String pageSize;

	    private Links links;

	 

		public Links getLinks() {
			return links;
		}

		public void setLinks(Links links) {
			this.links = links;
		}

		private String pageNum;

	    public Items[] getItems ()
	    {
	        return items;
	    }

	    public void setItems (Items[] items)
	    {
	        this.items = items;
	    }

	    public String getTotalItems ()
	    {
	        return totalItems;
	    }

	    public void setTotalItems (String totalItems)
	    {
	        this.totalItems = totalItems;
	    }

	    public String getPageSize ()
	    {
	        return pageSize;
	    }

	    public void setPageSize (String pageSize)
	    {
	        this.pageSize = pageSize;
	    }

	

	    public String getPageNum ()
	    {
	        return pageNum;
	    }

	    public void setPageNum (String pageNum)
	    {
	        this.pageNum = pageNum;
	    }

		@Override
		public String toString() {
			return "Playlist [items=" + Arrays.toString(items)
					+ ", totalItems=" + totalItems + ", pageSize=" + pageSize
					+ ", links=" + links + ", pageNum=" + pageNum + "]";
		}

	   }
