package com.cloudframe.app.o529351u.dto;

/**
*  The class LsSaveRecord4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class LsSaveRecord4 extends LsSaveRecord4Serialized {
   
				@Getter @Setter private SavRecTyp4Fileaid savRecTyp4Fileaid = new SavRecTyp4Fileaid();
	
	/**
	* Constructor for LsSaveRecord4
	**/
    public LsSaveRecord4() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSavRecTyp4Fileaid().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
