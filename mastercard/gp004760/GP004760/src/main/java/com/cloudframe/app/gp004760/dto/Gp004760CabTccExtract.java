package com.cloudframe.app.gp004760.dto;

/**
*  The class Gp004760CabTccExtract is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Gp004760CabTccExtract extends Gp004760CabTccExtractSerialized {
   

								@Getter @Setter private int gp004760RecordId;
				@Getter @Setter private Gp004760CabTccArray gp004760CabTccArray = new Gp004760CabTccArray();

	
	/**
	* Constructor for Gp004760CabTccExtract
	**/
    public Gp004760CabTccExtract() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getGp004760CabTccArray().setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 252
             ,4
             );
    }





}
  
