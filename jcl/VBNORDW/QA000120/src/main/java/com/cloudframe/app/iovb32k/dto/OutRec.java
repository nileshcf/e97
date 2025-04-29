package com.cloudframe.app.iovb32k.dto;

/**
*  The class OutRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class OutRec extends OutRecSerialized {
   

								@Getter @Setter private int outRecDataLen;
				@Getter @Setter private OutRecData outRecData = new OutRecData();
	
	/**
	* Constructor for OutRec
	**/
    public OutRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getOutRecData().setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
								setOutRecDataLen(0);
    }





}
  
