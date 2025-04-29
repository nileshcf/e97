package com.cloudframe.app.blkdblk.dto;

/**
*  The class AsciiTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;


@Data
public class AsciiTable extends AsciiTableSerialized {
   
				@Getter @Setter private MapAsciiTbl mapAsciiTbl = new MapAsciiTbl();
      private List<char[]> asciiToEbcdic; 

	
	/**
	* Constructor for AsciiTable
	**/
    public AsciiTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getMapAsciiTbl().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
