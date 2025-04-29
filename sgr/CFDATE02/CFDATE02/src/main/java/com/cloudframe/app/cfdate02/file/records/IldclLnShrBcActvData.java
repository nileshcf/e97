package com.cloudframe.app.cfdate02.file.records;

/**
*  The class IldclLnShrBcActvData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class IldclLnShrBcActvData extends IldclLnShrBcActvDataSerialized {
   
				@Getter @Setter private IldclLnShrBcActvDtl ildclLnShrBcActvDtl = new IldclLnShrBcActvDtl();
				@Getter @Setter private IldclLnShrBcActvHdr ildclLnShrBcActvHdr = new IldclLnShrBcActvHdr();
				@Getter @Setter private IldclLnShrBcActvTlr ildclLnShrBcActvTlr = new IldclLnShrBcActvTlr();
	
	/**
	* Constructor for IldclLnShrBcActvData
	**/
    public IldclLnShrBcActvData() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIldclLnShrBcActvDtl().setParent(this,getStartOffset() + 0);
					getIldclLnShrBcActvHdr().setParent(this,getStartOffset() + 0);
					getIldclLnShrBcActvTlr().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
