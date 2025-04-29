package com.cloudframe.app.edjaddrs.dto;

/**
*  The class GenericTotal is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class GenericTotal extends GenericTotalSerialized {
   

						@Getter @Setter private char[] xy = Field.fillLowValue(20);

								@Getter @Setter private long numericTotal;

								@Getter @Setter private long snumericTotal;

								@Getter @Setter private long compTotal;

								@Getter @Setter private long scompTotal;

								@Getter @Setter private long comp3Total;

								@Getter @Setter private long scomp3Total;
	
	/**
	* Constructor for GenericTotal
	**/
    public GenericTotal() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
