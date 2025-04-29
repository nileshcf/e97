package com.cloudframe.app.sf305120.dto;

/**
*  The class EsHeaderData270 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class EsHeaderData270 extends EsHeaderData270Serialized {
   
				@Getter @Setter private EsVersion1270 esVersion1270 = new EsVersion1270();
				@Getter @Setter private EsVersion2270 esVersion2270 = new EsVersion2270();
				@Getter @Setter private EsVersion3270 esVersion3270 = new EsVersion3270();
	
	/**
	* Constructor for EsHeaderData270
	**/
    public EsHeaderData270() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getEsVersion1270().setParent(this,getStartOffset() + 0);
					getEsVersion2270().setParent(this,getStartOffset() + 0);
					getEsVersion3270().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
