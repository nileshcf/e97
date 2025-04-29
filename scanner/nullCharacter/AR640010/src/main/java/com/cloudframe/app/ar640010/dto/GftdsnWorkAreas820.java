package com.cloudframe.app.ar640010.dto;

/**
*  The class GftdsnWorkAreas820 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class GftdsnWorkAreas820 extends GftdsnWorkAreas820Serialized {
   
				@Getter @Setter private GftdsnHlqid820 gftdsnHlqid820 = new GftdsnHlqid820();
				@Getter @Setter private GftdsnBuild820 gftdsnBuild820 = new GftdsnBuild820();
				@Getter @Setter private GftdsnBuild820Redefined gftdsnBuild820Redefined = new GftdsnBuild820Redefined();
	
	/**
	* Constructor for GftdsnWorkAreas820
	**/
    public GftdsnWorkAreas820() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getGftdsnHlqid820().setParent(this,getStartOffset() + 0);
					getGftdsnBuild820().setParent(this,getStartOffset() + 4);
					getGftdsnBuild820Redefined().setParent(this,getStartOffset() + 4);
	   	/*  end of offset */
							getGftdsnHlqid820().setString(fillSpace(4));
    }





}
  
