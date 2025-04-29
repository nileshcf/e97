package com.cloudframe.app.cfdate02.file.records;

/**
*  The class OldclLnShrBcActvData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class OldclLnShrBcActvData extends OldclLnShrBcActvDataSerialized {
   
				@Getter @Setter private OldclLnShrBcActvDtl oldclLnShrBcActvDtl = new OldclLnShrBcActvDtl();
				@Getter @Setter private OldclLnShrBcActvHdr oldclLnShrBcActvHdr = new OldclLnShrBcActvHdr();
				@Getter @Setter private OldclLnShrBcActvTlr oldclLnShrBcActvTlr = new OldclLnShrBcActvTlr();
	
	/**
	* Constructor for OldclLnShrBcActvData
	**/
    public OldclLnShrBcActvData() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getOldclLnShrBcActvDtl().setParent(this,getStartOffset() + 0);
					getOldclLnShrBcActvHdr().setParent(this,getStartOffset() + 0);
					getOldclLnShrBcActvTlr().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
