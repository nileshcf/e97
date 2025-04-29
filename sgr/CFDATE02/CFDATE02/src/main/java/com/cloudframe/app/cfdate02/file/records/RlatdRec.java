package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlatdRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RlatdRec extends RlatdRecSerialized {
   
				@Getter @Setter private RlatdDtl rlatdDtl = new RlatdDtl();
				@Getter @Setter private RlatdHdr rlatdHdr = new RlatdHdr();
				@Getter @Setter private RlatdTlr rlatdTlr = new RlatdTlr();
	
	/**
	* Constructor for RlatdRec
	**/
    public RlatdRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRlatdDtl().setParent(this,getStartOffset() + 0);
					getRlatdHdr().setParent(this,getStartOffset() + 0);
					getRlatdTlr().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
