package com.cloudframe.app.iovb32k.dto;

/**
*  The class InRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class InRec extends InRecSerialized {
   

								@Getter @Setter private int inRecDataLen;
				@Getter @Setter private InRecData inRecData = new InRecData();
	
	/**
	* Constructor for InRec
	**/
    public InRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getInRecData().setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
								setInRecDataLen(0);
    }





}
  
