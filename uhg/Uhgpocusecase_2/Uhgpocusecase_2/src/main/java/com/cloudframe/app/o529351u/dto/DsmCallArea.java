package com.cloudframe.app.o529351u.dto;

/**
*  The class DsmCallArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class DsmCallArea extends DsmCallAreaSerialized {
   

				@Getter @Setter private DsmCommonArea dsmCommonArea = new DsmCommonArea();
				@Getter @Setter private DsmLogArea dsmLogArea = new DsmLogArea();
	
	/**
	* Constructor for DsmCallArea
	**/
    public DsmCallArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getDsmCommonArea().setParent(this,getStartOffset() + 24);
					getDsmLogArea().setParent(this,getStartOffset() + 990);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("VYDSMARA - STARTS HERE  ").toCharArray()
             , getStartOffset() + 0
             ,24
             );
    }



	/**
	 * 	initializes DsmCallArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getDsmCommonArea().initialize();
     
          getDsmLogArea().initialize();
     
   }


}
  
