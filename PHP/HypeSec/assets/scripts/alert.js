document.addEventListener('DOMContentLoaded', () => {
    const params = new URLSearchParams(window.location.search);
    const status = params.get('status');

    if (status === 'success') {
        Swal.fire({
            icon: 'success',
            title: 'Sucesso!',
            text: 'Operação realizada com sucesso!.',
            confirmButtonText: 'OK',
        });
    } else if (status === 'error') {
        Swal.fire({
            icon: 'error',
            title: 'Erro!',
            text: 'Ocorreu um erro ao cadastrar o produto. Tente novamente.',
            confirmButtonText: 'OK',
        });
    }
});