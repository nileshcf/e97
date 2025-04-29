package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnAcmn009pParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class CmnAcmn009pParms extends CmnAcmn009pParmsSerialized {
   
				@Getter @Setter private CmnPgmArea cmnPgmArea = new CmnPgmArea();
				@Getter @Setter private Dfhcommarea10 dfhcommarea10 = new Dfhcommarea10();
				@Getter @Setter private Dfhcommarea11 dfhcommarea11 = new Dfhcommarea11();
				@Getter @Setter private Dfhcommarea12 dfhcommarea12 = new Dfhcommarea12();
				@Getter @Setter private Dfhcommarea13 dfhcommarea13 = new Dfhcommarea13();
				@Getter @Setter private Dfhcommarea14 dfhcommarea14 = new Dfhcommarea14();
				@Getter @Setter private Dfhcommarea15 dfhcommarea15 = new Dfhcommarea15();
				@Getter @Setter private Dfhcommarea16 dfhcommarea16 = new Dfhcommarea16();
				@Getter @Setter private Dfhcommarea17 dfhcommarea17 = new Dfhcommarea17();
	
	/**
	* Constructor for CmnAcmn009pParms
	**/
    public CmnAcmn009pParms() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCmnPgmArea().setParent(this,getStartOffset() + 0);
					getDfhcommarea10().setParent(this,getStartOffset() + 1024);
					getDfhcommarea11().setParent(this,getStartOffset() + 1024);
					getDfhcommarea12().setParent(this,getStartOffset() + 1024);
					getDfhcommarea13().setParent(this,getStartOffset() + 1024);
					getDfhcommarea14().setParent(this,getStartOffset() + 1024);
					getDfhcommarea15().setParent(this,getStartOffset() + 1024);
					getDfhcommarea16().setParent(this,getStartOffset() + 1024);
					getDfhcommarea17().setParent(this,getStartOffset() + 1024);
	   	/*  end of offset */
    }





}
  
