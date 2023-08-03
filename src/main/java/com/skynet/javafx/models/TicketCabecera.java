package com.skynet.javafx.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "TPVCAB")
public class TicketCabecera {

    @Id
    private Long id;

    private String numauto;

    private String numero;

    private String codigo;

    private Double unidades;

    private Double precio;

    private Double importe;

    private LocalDate fecha;

    private LocalDateTime hora;

    private String concepto;

    private Integer turno;

    private String fechat;

    private Boolean rectificativa;

    private Double importedcto;

    private String ticketorigen;

    private Integer tipoiva;

    private Double sg_precio;

    private Boolean sg;

    private Integer sg_linenumber;

    private Double sg_totaldiscountedamount;

    private Double sg_discountpercentage;

    private Double sg_totaltaxamount;

    private Boolean sg_recalculo;

    private Boolean sg_promo;

    private LocalDateTime sg_envio;

    private Boolean rectificada;

    private String sg_equivalencia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumauto() {
        return numauto;
    }

    public void setNumauto(String numauto) {
        this.numauto = numauto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getUnidades() {
        return unidades;
    }

    public void setUnidades(Double unidades) {
        this.unidades = unidades;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Integer getTurno() {
        return turno;
    }

    public void setTurno(Integer turno) {
        this.turno = turno;
    }

    public String getFechat() {
        return fechat;
    }

    public void setFechat(String fechat) {
        this.fechat = fechat;
    }

    public Boolean getRectificativa() {
        return rectificativa;
    }

    public void setRectificativa(Boolean rectificativa) {
        this.rectificativa = rectificativa;
    }

    public Double getImportedcto() {
        return importedcto;
    }

    public void setImportedcto(Double importedcto) {
        this.importedcto = importedcto;
    }

    public String getTicketorigen() {
        return ticketorigen;
    }

    public void setTicketorigen(String ticketorigen) {
        this.ticketorigen = ticketorigen;
    }

    public Integer getTipoiva() {
        return tipoiva;
    }

    public void setTipoiva(Integer tipoiva) {
        this.tipoiva = tipoiva;
    }

    public Double getSg_precio() {
        return sg_precio;
    }

    public void setSg_precio(Double sg_precio) {
        this.sg_precio = sg_precio;
    }

    public Boolean getSg() {
        return sg;
    }

    public void setSg(Boolean sg) {
        this.sg = sg;
    }

    public Integer getSg_linenumber() {
        return sg_linenumber;
    }

    public void setSg_linenumber(Integer sg_linenumber) {
        this.sg_linenumber = sg_linenumber;
    }

    public Double getSg_totaldiscountedamount() {
        return sg_totaldiscountedamount;
    }

    public void setSg_totaldiscountedamount(Double sg_totaldiscountedamount) {
        this.sg_totaldiscountedamount = sg_totaldiscountedamount;
    }

    public Double getSg_discountpercentage() {
        return sg_discountpercentage;
    }

    public void setSg_discountpercentage(Double sg_discountpercentage) {
        this.sg_discountpercentage = sg_discountpercentage;
    }

    public Double getSg_totaltaxamount() {
        return sg_totaltaxamount;
    }

    public void setSg_totaltaxamount(Double sg_totaltaxamount) {
        this.sg_totaltaxamount = sg_totaltaxamount;
    }

    public Boolean getSg_recalculo() {
        return sg_recalculo;
    }

    public void setSg_recalculo(Boolean sg_recalculo) {
        this.sg_recalculo = sg_recalculo;
    }

    public Boolean getSg_promo() {
        return sg_promo;
    }

    public void setSg_promo(Boolean sg_promo) {
        this.sg_promo = sg_promo;
    }

    public LocalDateTime getSg_envio() {
        return sg_envio;
    }

    public void setSg_envio(LocalDateTime sg_envio) {
        this.sg_envio = sg_envio;
    }

    public Boolean getRectificada() {
        return rectificada;
    }

    public void setRectificada(Boolean rectificada) {
        this.rectificada = rectificada;
    }

    public String getSg_equivalencia() {
        return sg_equivalencia;
    }

    public void setSg_equivalencia(String sg_equivalencia) {
        this.sg_equivalencia = sg_equivalencia;
    }

    @Override
    public String toString() {
        return "TicketCabecera{" +
                "numauto='" + numauto + '\'' +
                ", codigo='" + codigo + '\'' +
                ", unidades=" + unidades +
                ", precio=" + precio +
                ", importe=" + importe +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", concepto='" + concepto + '\'' +
                ", fechat='" + fechat + '\'' +
                ", rectificativa=" + rectificativa +
                ", ticketorigen='" + ticketorigen + '\'' +
                ", tipoiva=" + tipoiva +
                ", rectificada=" + rectificada +
                '}';
    }
}
