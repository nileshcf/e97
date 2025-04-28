package com.cloudframe.app.process;

import com.cloudframe.app.bm80022.Bm80022Ctx.OpenFicherosOutCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.CloseCurGe18OutCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.OpenFicherosInCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.TratarErrFicheroInCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.RecuperarFilaOutCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.TratarFilaOutCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.ProcesoOutCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.AbortarOutCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.InformarSalidaOutCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.StartOfProgramInCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.LeerCursorMrowOutCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.CerrarFicherosOutCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.OpenCurGe18InCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.TratarFilaInCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.EstadisticasInCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.EscribirSalidaOutCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.FinConErrorOutCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.EscribirSalidaInCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.CloseCurGe18InCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.OpenCurGe18OutCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.MoverRowsetInCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.MoverRowsetOutCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.FinConErrorInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.bm80022.Bm80022Ctx.RecuperarFilaInCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.CerrarFicherosInCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.InformarSalidaInCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.bm80022.Bm80022Ctx.InicioOutCtx;
import com.cloudframe.app.bm80022.Bm80022Ctx.LeerCursorMrowInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Bm80022 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Bm80022Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - START-OF-PROGRAM
     *
     */
    public void startOfProgram(StartOfProgramInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INICIO
     *
     * @return 
     */
    public InicioOutCtx inicio(Bm80022Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-OPEN-FICHEROS
     *
     * @return 
     */
    public OpenFicherosOutCtx openFicheros(OpenFicherosInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-OPEN-CUR-GE18
     *
     * @return 
     */
    public OpenCurGe18OutCtx openCurGe18(OpenCurGe18InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1300-LEER-CURSOR-MROW
     *
     * @return 
     */
    public LeerCursorMrowOutCtx leerCursorMrow(LeerCursorMrowInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1310-RECUPERAR-FILA
     *
     * @return 
     */
    public RecuperarFilaOutCtx recuperarFila(RecuperarFilaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1320-TRATAR-FILA
     *
     * @return 
     */
    public TratarFilaOutCtx tratarFila(TratarFilaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1330-MOVER-ROWSET
     *
     * @return 
     */
    public MoverRowsetOutCtx moverRowset(MoverRowsetInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1400-CLOSE-CUR-GE18
     *
     * @return 
     */
    public CloseCurGe18OutCtx closeCurGe18(CloseCurGe18InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESO
     *
     * @return 
     */
    public ProcesoOutCtx proceso(Bm80022Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-INFORMAR-SALIDA
     *
     * @return 
     */
    public InformarSalidaOutCtx informarSalida(InformarSalidaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2110-ESCRIBIR-SALIDA
     *
     * @return 
     */
    public EscribirSalidaOutCtx escribirSalida(EscribirSalidaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-FIN
     *
     */
    public void fin(Bm80022Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3100-CERRAR-FICHEROS
     *
     * @return 
     */
    public CerrarFicherosOutCtx cerrarFicheros(CerrarFicherosInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - U9990-ESTADISTICAS
     *
     */
    public void estadisticas(EstadisticasInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - U9998-TRATAR-ERR-FICHERO
     *
     */
    public void tratarErrFichero(TratarErrFicheroInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - U9999-ABORTAR
     *
     * @return 
     */
    public AbortarOutCtx abortar(Bm80022Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-FIN-CON-ERROR
     *
     * @return 
     */
    public FinConErrorOutCtx finConError(FinConErrorInCtx methodIn) throws Exception;


     /**
	 * This will invoke the program given parameters from the
      * caller program.
	 *
	 * @return return code of the program
	 */
     public int call(ProgramContext programCtx, Object[] parameters) throws Exception;

     /**
	 * This will invoke the program given Field parameters from
      * the caller program.
	 *
	 * @return return code of the program
	 */
     public int call(ProgramContext programCtx, Field... parameters) throws Exception;
}
