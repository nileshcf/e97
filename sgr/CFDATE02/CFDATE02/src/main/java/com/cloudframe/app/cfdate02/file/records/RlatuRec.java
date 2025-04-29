package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlatuRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RlatuRec extends RlatuRecSerialized {
   
				@Getter @Setter private RlatuDtl rlatuDtl = new RlatuDtl();
				@Getter @Setter private RlatuHdr rlatuHdr = new RlatuHdr();
				@Getter @Setter private RlatuTlr rlatuTlr = new RlatuTlr();
	
	/**
	* Constructor for RlatuRec
	**/
    public RlatuRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRlatuDtl().setParent(this,getStartOffset() + 0);
					getRlatuHdr().setParent(this,getStartOffset() + 0);
					getRlatuTlr().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
