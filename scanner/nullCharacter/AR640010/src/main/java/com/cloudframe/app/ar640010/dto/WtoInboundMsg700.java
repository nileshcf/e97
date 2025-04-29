package com.cloudframe.app.ar640010.dto;

/**
*  The class WtoInboundMsg700 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WtoInboundMsg700 extends WtoInboundMsg700Serialized {
   

						@Getter @Setter private char[] wtoIbJobName700 = new char[8];


						@Getter @Setter private char[] wtoIbBulkId700 = new char[4];


						@Getter @Setter private char[] wtoIbCyclNum700 = new char[3];


						@Getter @Setter private char[] wtoIbEndptId700 = new char[7];


						@Getter @Setter private char[] wtoIbFileDsn700 = new char[44];

	
	/**
	* Constructor for WtoInboundMsg700
	**/
    public WtoInboundMsg700() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWtoIbJobName700(fillSpace(8));
       replaceValue( // serialize and save the value
             (" GFTC320I INBD AVAIL: BULK=").toCharArray()
             , getStartOffset() + 8
             ,27
             );
								setWtoIbBulkId700(fillSpace(4));
       replaceValue( // serialize and save the value
             (" CYCLE=").toCharArray()
             , getStartOffset() + 39
             ,7
             );
								setWtoIbCyclNum700(fillSpace(3));
       replaceValue( // serialize and save the value
             (" APPEPT=").toCharArray()
             , getStartOffset() + 49
             ,8
             );
								setWtoIbEndptId700(fillSpace(7));
       replaceValue( // serialize and save the value
             (" DSN=").toCharArray()
             , getStartOffset() + 64
             ,5
             );
								setWtoIbFileDsn700(fillSpace(44));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 113
             ,2
             );
    }





}
  
