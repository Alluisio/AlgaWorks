package com.example.algamoney.api.repository.lancamento;

import com.example.algamoney.api.model.Lancamento;
import com.example.algamoney.api.repository.filter.LancamentoFilter;

import java.util.List;

public interface LancamentoReposytoryQuery  {

    public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}
