package com.cloudframe.app.sf320010.dto;

/**
*  The class InfoSecRcd800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class InfoSecRcd800 extends InfoSecRcd800Serialized {
   
				@Getter @Setter private RecDate800 recDate800 = new RecDate800();

				@Getter @Setter private RecTime800 recTime800 = new RecTime800();

						@Getter @Setter private char[] recClass800 = new char[1];

						@Getter @Setter private char[] recType800 = new char[1];

						@Getter @Setter private char[] localMipId800 = new char[3];

						@Getter @Setter private char[] remMipId800 = new char[3];

						@Getter @Setter private char[] operId800 = new char[7];

						@Getter @Setter private char[] message800 = new char[40];

	
	/**
	* Constructor for InfoSecRcd800
	**/
    public InfoSecRcd800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRecDate800().setParent(this,getStartOffset() + 0);
					getRecTime800().setParent(this,getStartOffset() + 11);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 10
             ,1
             );
								setRecClass800(fillSpace(1));
								setRecType800(fillSpace(1));
								setLocalMipId800(fillSpace(3));
								setRemMipId800(fillSpace(3));
								setOperId800(fillSpace(7));
								setMessage800(fillSpace(40));
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 74
             ,6
             );
    }





}
  
