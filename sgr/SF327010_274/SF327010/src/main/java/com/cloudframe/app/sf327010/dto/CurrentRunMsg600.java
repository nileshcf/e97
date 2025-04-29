package com.cloudframe.app.sf327010.dto;

/**
*  The class CurrentRunMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class CurrentRunMsg600 extends CurrentRunMsg600Serialized {
   

				@Getter @Setter private CurrentDate600 currentDate600 = new CurrentDate600();

				@Getter @Setter private CurrentTime600 currentTime600 = new CurrentTime600();

	
	/**
	* Constructor for CurrentRunMsg600
	**/
    public CurrentRunMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCurrentDate600().setParent(this,getStartOffset() + 29);
					getCurrentTime600().setParent(this,getStartOffset() + 47);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF327010-0002 CURRENT-DATE = ").toCharArray()
             , getStartOffset() + 0
             ,29
             );
       replaceValue( // serialize and save the value
             ("  TIME= ").toCharArray()
             , getStartOffset() + 39
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 55
             ,8
             );
    }





}
  
