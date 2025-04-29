package com.cloudframe.app.cfdate02.file.records;

/**
*  The class IldcrLnShrGrpRemData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class IldcrLnShrGrpRemData extends IldcrLnShrGrpRemDataSerialized {
   
				@Getter @Setter private IldcrLnShrGrpRemDtl ildcrLnShrGrpRemDtl = new IldcrLnShrGrpRemDtl();
				@Getter @Setter private IldcrLnShrGrpRemHdr ildcrLnShrGrpRemHdr = new IldcrLnShrGrpRemHdr();
				@Getter @Setter private IldcrLnShrGrpRemTlr ildcrLnShrGrpRemTlr = new IldcrLnShrGrpRemTlr();
	
	/**
	* Constructor for IldcrLnShrGrpRemData
	**/
    public IldcrLnShrGrpRemData() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIldcrLnShrGrpRemDtl().setParent(this,getStartOffset() + 0);
					getIldcrLnShrGrpRemHdr().setParent(this,getStartOffset() + 0);
					getIldcrLnShrGrpRemTlr().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
