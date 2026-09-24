const form = document.getElementById('form-produto');
const lista = document.getElementById('lista');
const campoBusca = document.getElementById('busca');

async function buscarProdutos() {
    const resposta = await fetch('/produtos?descricao=' + encodeURIComponent(campoBusca.value));
    const produtos = await resposta.json();

    lista.innerHTML = '';
    produtos.forEach(function (produto) {
    const tr = document.createElement('tr');
    [produto.idProduto, produto.descricao, produto.codigoFabricante || ''].forEach(function (valor) {
         const td = document.createElement('td');
          td.textContent = valor;
          tr.appendChild(td);
        });
        lista.appendChild(tr);
      });
    }

  form.addEventListener('submit', async function (evento) {
      evento.preventDefault();

       const resposta = await fetch('/produtos', {
          method: 'POST',
          headers: { 'Content-Type': 'application/json' },
          body: JSON.stringify({
            descricao: document.getElementById('descricao').value,
            codigoFabricante: document.getElementById('codigoFabricante').value
          })
        });

        if (!resposta.ok) { alert('Erro ao salvar o produto'); return;}

        form.reset();
        buscarProdutos();
      });

document.getElementById('btn-buscar').addEventListener('click', buscarProdutos);
buscarProdutos();