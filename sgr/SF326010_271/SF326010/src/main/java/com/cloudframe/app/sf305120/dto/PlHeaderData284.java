package com.cloudframe.app.sf305120.dto;

/**
*  The class PlHeaderData284 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class PlHeaderData284 extends PlHeaderData284Serialized {
   

						@Getter @Setter private char[] plHeaderId284 = new char[2];

								@Getter @Setter private int plVersion284;

								@Getter @Setter private long plHdrLength284;

								@Getter @Setter private int plTlvLength284;

						@Getter @Setter private char[] plPayloadType284 = new char[4];

								@Getter @Setter private long plPayloadLnth284;

						@Getter @Setter private char[] plPayloadData284 = new char[2000];
	
	/**
	* Constructor for PlHeaderData284
	**/
    public PlHeaderData284() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPlHeaderId284(("PL").toCharArray());
								setPlVersion284(1);
								setPlHdrLength284(0L);
								setPlTlvLength284(0);
								setPlPayloadType284(fillSpace(4));
								setPlPayloadLnth284(0L);
								setPlPayloadData284(pad(2000," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
