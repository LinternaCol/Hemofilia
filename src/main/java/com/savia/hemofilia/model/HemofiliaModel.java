package com.savia.hemofilia.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
@Table(name = "hemofilia")
public class HemofiliaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHemofilia", nullable = false,unique = true)
    private Long id;
    @Column(length = 20)
    private String primerNombre;
    @Column(length = 20)
    private String segundoNombre;
    @Column(length = 20)
    private String primerApellido;
    @Column(length = 20)
    private String segundoApellido;
    @Pattern(regexp = "RC|TI|CC|CE|PA|MS|AS|CD|SC|PE")
    private String tipoIdentificacionUsuario;
    @Column(length = 20)
    @NotNull
    private String numeroIdentificacion;
    @Column()
    private Date fechaNacimientoUsuario;
    @Column()
    private String sexo;
    @Column()
    private int ocupacionUsuario;
    @Column()
    @Pattern(regexp = "C|S|P|E|N")
    private String sgsss;
    @Column()
    private String codigoEapb;
    @Column()
    private int CodigoPertenenciaEtnica;
    @Column()
    private int grupoPoblacional;
    @Column()
    private int municipioResidencia;
    @Column()
    private String numeroTelefonicoUsuario;
    @Column()
    private Date fechaAfilicionEps;
    @Column()
    private int estadoGestacionUsuario;
    @Column()
    private int usuarioProgramaPlanificacion;
    @Column()
    private int edadUsuarioConsulta;
    @Column()
    private int motivoPruebaDiagnostico;
    @Column()
    private Date fechaDiagnostico;
    @Column()
    private Long codigoValidoHabilitacionIPS;
    @Column()
    private int tipoDeficienciaDiagnosticada;
    @Column()
    private int clasificacionSeveridadNivelFactor;
    @Column()
    private float actividadCoagulanteFactor;
    @Column()
    private int antecedentesFamiliaresAsociadosHemofilia;
    @Column()
    private int factorRecibidoPrimerTratamiento;
    @Column()
    private int esquemaPrimerTratamiento;
    @Column()
    private Date fechaInicioPrimerTratamiento;
    @Column()
    private int factorRecibidoActualTratamieno;
    @Column()
    private int esquemaActualTratamiento;
    @Column()
    private float pesoUsuario;
    @Column()
    private float dosis;
    @Column()
    private float frecuenciaSemana;
    @Column()
    private int numeroDosisTotalesPeriodo;
    @Column()
    private int numeroAplicacionesTotalesPeriodo;
    @Column()
    private int modalidadAplicacionTratamiento;
    @Column()
    private int viaAdministracion;
    @Column()
    private String cum1;
    @Column()
    private String cum2;
    @Column()
    private String cum3;
    @Column()
    private String cum4;
    @Column()
    private Long  codigoHabilitacionEps;
    @Column()
    private int hermartrosis;
    @Column()
    private int hemorragiaIlioPsoas;
    @Column()
    private int numeroHermatrosisEspontaneasUltimoAno;
    @Column()
    private int numeroHermatrosisTraumaticasUltimoAno;
    @Column()
    private int hemorragiaMuscular;
    @Column()
    private int hemorragiaIntracraneal;
    @Column()
    private int hemorragiaCuello;
    @Column()
    private int hemorragiaOral;
    @Column()
    private int hemorragiaOtrasLocalizaciones;
    @Column()
    private int hemorragiaOtrasDiferentesHematrosisEspontaneas;
    @Column()
    private int hemorragiaOtrasDiferentesHematrosisTraumaticas;
    @Column()
    private int hemorragiaAsociadaProcesosDiferentesHematrosis;
    @Column()
    private int presenciaInhibidorFechaCorte;
    @Column()
    private Date fechaDeterminacionTitulosInhibidor;
    @Column()
    private int recibidoItiUsuario;
    @Column()
    private int recibioItiPeriodo;
    @Column()
    private int tiempoUsuarioIti;
    @Column()
    private int artropatiaHemofilicaCronica;
    @Column()
    private int numArticulacionesComprometidas;
    @Column()
    private int usuarioInfectadoVhc;
    @Column()
    private int usuarioInfectadoVhb;
    @Column()
    private int usuarioInfectadoVih;
    @Column()
    private int pseudotumores;
    @Column()
    private int fracturas;
    @Column()
    private int anafilaxis;
    @Column()
    private int factorAnacfiliactica;
    @Column()
    private int reemplazoArticularesVida;
    @Column()
    private int reemplazoArticularesPeriodo;
    @Column()
    private int profesionalAtencionUsuario;
    @Column()
    private int consultasPresencialesHematólogo;
    @Column()
    private int consultasPresencialesOrtopedista;
    @Column()
    private int intervencionProfesionalEnfermeria;
    @Column()
    private int consultasOdontologo;
    @Column()
    private int consultaNutricionista;
    @Column()
    private int intervencionTrabajoSocial;
    @Column()
    private int consultaFisiatria;
    @Column()
    private int consultaPsicologia;
    @Column()
    private int intervencionQuimicoFarmaceutico;
    @Column()
    private int intervencionFisioterapia;
    @Column()
    private String primerNombreMedicoPrincipal;
    @Column()
    private String segundoNombreMedicoPrincipal;
    @Column()
    private String primerApellidoMedicoPrincipal;
    @Column()
    private String segundoApellidoMedicoPrincipal;
    @Column()
    private int numeroAtencionesServicioUrgenciasHemofilia;
    @Column()
    private int numeroEventosHospitalariosHemofilia;
    @Column()
    private Double costoTotalUnidadesFactor;
    @Column()
    private Double costosAgentePuente;
    @Column()
    private Double costosCoagulopatia;
    @Column()
    private Double costosIncapacidadesCoagulopatia;
    @Column()
    private int novedades;
    @Column()
    private int causaMuerte;
    @Column()
    private Date fechaMuerte;
    @Column()
    private int bdua;
    @Column()
    private Date fechaCorte;





    //Constructor


    public HemofiliaModel(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String tipoIdentificacionUsuario, String numeroIdentificacion, Date fechaNacimientoUsuario, String sexo, int ocupacionUsuario, String sgsss, String codigoEapb, int codigoPertenenciaEtnica, int grupoPoblacional, int municipioResidencia, String numeroTelefonicoUsuario, Date fechaAfilicionEps, int estadoGestacionUsuario, int usuarioProgramaPlanificacion, int edadUsuarioConsulta, int motivoPruebaDiagnostico, Date fechaDiagnostico, Long codigoValidoHabilitacionIPS, int tipoDeficienciaDiagnosticada, int clasificacionSeveridadNivelFactor, float actividadCoagulanteFactor, int antecedentesFamiliaresAsociadosHemofilia, int factorRecibidoPrimerTratamiento, int esquemaPrimerTratamiento, Date fechaInicioPrimerTratamiento, int factorRecibidoActualTratamieno, int esquemaActualTratamiento, float pesoUsuario, float dosis, float frecuenciaSemana, int numeroDosisTotalesPeriodo, int numeroAplicacionesTotalesPeriodo, int modalidadAplicacionTratamiento, int viaAdministracion, String cum1, String cum2, String cum3, String cum4, Long codigoHabilitacionEps, int hermartrosis, int hemorragiaIlioPsoas, int numeroHermatrosisEspontaneasUltimoAno, int numeroHermatrosisTraumaticasUltimoAno, int hemorragiaMuscular, int hemorragiaIntracraneal, int hemorragiaCuello, int hemorragiaOral, int hemorragiaOtrasLocalizaciones, int hemorragiaOtrasDiferentesHematrosisEspontaneas, int hemorragiaOtrasDiferentesHematrosisTraumaticas, int hemorragiaAsociadaProcesosDiferentesHematrosis, int presenciaInhibidorFechaCorte, Date fechaDeterminacionTitulosInhibidor, int recibidoItiUsuario, int recibioItiPeriodo, int tiempoUsuarioIti, int artropatiaHemofilicaCronica, int numArticulacionesComprometidas, int usuarioInfectadoVhc, int usuarioInfectadoVhb, int usuarioInfectadoVih, int pseudotumores, int fracturas, int anafilaxis, int factorAnacfiliactica, int reemplazoArticularesVida, int reemplazoArticularesPeriodo, int profesionalAtencionUsuario, int consultasPresencialesHematólogo, int consultasPresencialesOrtopedista, int intervencionProfesionalEnfermeria, int consultasOdontologo, int consultaNutricionista, int intervencionTrabajoSocial, int consultaFisiatria, int consultaPsicologia, int intervencionQuimicoFarmaceutico, int intervencionFisioterapia, String primerNombreMedicoPrincipal, String segundoNombreMedicoPrincipal, String primerApellidoMedicoPrincipal, String segundoApellidoMedicoPrincipal, int numeroAtencionesServicioUrgenciasHemofilia, int numeroEventosHospitalariosHemofilia, Double costoTotalUnidadesFactor, Double costosAgentePuente, Double costosCoagulopatia, Double costosIncapacidadesCoagulopatia, int novedades, int causaMuerte, Date fechaMuerte, int bdua, Date fechaCorte) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.tipoIdentificacionUsuario = tipoIdentificacionUsuario;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.sexo = sexo;
        this.ocupacionUsuario = ocupacionUsuario;
        this.sgsss = sgsss;
        this.codigoEapb = codigoEapb;
        CodigoPertenenciaEtnica = codigoPertenenciaEtnica;
        this.grupoPoblacional = grupoPoblacional;
        this.municipioResidencia = municipioResidencia;
        this.numeroTelefonicoUsuario = numeroTelefonicoUsuario;
        this.fechaAfilicionEps = fechaAfilicionEps;
        this.estadoGestacionUsuario = estadoGestacionUsuario;
        this.usuarioProgramaPlanificacion = usuarioProgramaPlanificacion;
        this.edadUsuarioConsulta = edadUsuarioConsulta;
        this.motivoPruebaDiagnostico = motivoPruebaDiagnostico;
        this.fechaDiagnostico = fechaDiagnostico;
        this.codigoValidoHabilitacionIPS = codigoValidoHabilitacionIPS;
        this.tipoDeficienciaDiagnosticada = tipoDeficienciaDiagnosticada;
        this.clasificacionSeveridadNivelFactor = clasificacionSeveridadNivelFactor;
        this.actividadCoagulanteFactor = actividadCoagulanteFactor;
        this.antecedentesFamiliaresAsociadosHemofilia = antecedentesFamiliaresAsociadosHemofilia;
        this.factorRecibidoPrimerTratamiento = factorRecibidoPrimerTratamiento;
        this.esquemaPrimerTratamiento = esquemaPrimerTratamiento;
        this.fechaInicioPrimerTratamiento = fechaInicioPrimerTratamiento;
        this.factorRecibidoActualTratamieno = factorRecibidoActualTratamieno;
        this.esquemaActualTratamiento = esquemaActualTratamiento;
        this.pesoUsuario = pesoUsuario;
        this.dosis = dosis;
        this.frecuenciaSemana = frecuenciaSemana;
        this.numeroDosisTotalesPeriodo = numeroDosisTotalesPeriodo;
        this.numeroAplicacionesTotalesPeriodo = numeroAplicacionesTotalesPeriodo;
        this.modalidadAplicacionTratamiento = modalidadAplicacionTratamiento;
        this.viaAdministracion = viaAdministracion;
        this.cum1 = cum1;
        this.cum2 = cum2;
        this.cum3 = cum3;
        this.cum4 = cum4;
        this.codigoHabilitacionEps = codigoHabilitacionEps;
        this.hermartrosis = hermartrosis;
        this.hemorragiaIlioPsoas = hemorragiaIlioPsoas;
        this.numeroHermatrosisEspontaneasUltimoAno = numeroHermatrosisEspontaneasUltimoAno;
        this.numeroHermatrosisTraumaticasUltimoAno = numeroHermatrosisTraumaticasUltimoAno;
        this.hemorragiaMuscular = hemorragiaMuscular;
        this.hemorragiaIntracraneal = hemorragiaIntracraneal;
        this.hemorragiaCuello = hemorragiaCuello;
        this.hemorragiaOral = hemorragiaOral;
        this.hemorragiaOtrasLocalizaciones = hemorragiaOtrasLocalizaciones;
        this.hemorragiaOtrasDiferentesHematrosisEspontaneas = hemorragiaOtrasDiferentesHematrosisEspontaneas;
        this.hemorragiaOtrasDiferentesHematrosisTraumaticas = hemorragiaOtrasDiferentesHematrosisTraumaticas;
        this.hemorragiaAsociadaProcesosDiferentesHematrosis = hemorragiaAsociadaProcesosDiferentesHematrosis;
        this.presenciaInhibidorFechaCorte = presenciaInhibidorFechaCorte;
        this.fechaDeterminacionTitulosInhibidor = fechaDeterminacionTitulosInhibidor;
        this.recibidoItiUsuario = recibidoItiUsuario;
        this.recibioItiPeriodo = recibioItiPeriodo;
        this.tiempoUsuarioIti = tiempoUsuarioIti;
        this.artropatiaHemofilicaCronica = artropatiaHemofilicaCronica;
        this.numArticulacionesComprometidas = numArticulacionesComprometidas;
        this.usuarioInfectadoVhc = usuarioInfectadoVhc;
        this.usuarioInfectadoVhb = usuarioInfectadoVhb;
        this.usuarioInfectadoVih = usuarioInfectadoVih;
        this.pseudotumores = pseudotumores;
        this.fracturas = fracturas;
        this.anafilaxis = anafilaxis;
        this.factorAnacfiliactica = factorAnacfiliactica;
        this.reemplazoArticularesVida = reemplazoArticularesVida;
        this.reemplazoArticularesPeriodo = reemplazoArticularesPeriodo;
        this.profesionalAtencionUsuario = profesionalAtencionUsuario;
        this.consultasPresencialesHematólogo = consultasPresencialesHematólogo;
        this.consultasPresencialesOrtopedista = consultasPresencialesOrtopedista;
        this.intervencionProfesionalEnfermeria = intervencionProfesionalEnfermeria;
        this.consultasOdontologo = consultasOdontologo;
        this.consultaNutricionista = consultaNutricionista;
        this.intervencionTrabajoSocial = intervencionTrabajoSocial;
        this.consultaFisiatria = consultaFisiatria;
        this.consultaPsicologia = consultaPsicologia;
        this.intervencionQuimicoFarmaceutico = intervencionQuimicoFarmaceutico;
        this.intervencionFisioterapia = intervencionFisioterapia;
        this.primerNombreMedicoPrincipal = primerNombreMedicoPrincipal;
        this.segundoNombreMedicoPrincipal = segundoNombreMedicoPrincipal;
        this.primerApellidoMedicoPrincipal = primerApellidoMedicoPrincipal;
        this.segundoApellidoMedicoPrincipal = segundoApellidoMedicoPrincipal;
        this.numeroAtencionesServicioUrgenciasHemofilia = numeroAtencionesServicioUrgenciasHemofilia;
        this.numeroEventosHospitalariosHemofilia = numeroEventosHospitalariosHemofilia;
        this.costoTotalUnidadesFactor = costoTotalUnidadesFactor;
        this.costosAgentePuente = costosAgentePuente;
        this.costosCoagulopatia = costosCoagulopatia;
        this.costosIncapacidadesCoagulopatia = costosIncapacidadesCoagulopatia;
        this.novedades = novedades;
        this.causaMuerte = causaMuerte;
        this.fechaMuerte = fechaMuerte;
        this.bdua = bdua;
        this.fechaCorte = fechaCorte;
    }

    public HemofiliaModel() {
    }



    //Getters an setters


}
