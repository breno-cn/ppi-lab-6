# Laboratório 4 - Programação Para Internet

## 9 - O que acontece caso o atributo “action” do formulário por alterado para action="/add"? 
Com essa mudança, torna-se acessível um formulário para preencher as informaçõeso de um novo usuário. Porém, o endpoint de adicionar o mesmo encontra-se com erro.

## 13 - Realize o teste deste novo formulário e anote o resultado obtidos.
Ocorre um comportamento semelhanto ao item 9. O Formulário para preencher as informações de subject está disponível, porém a chamada do método ainda continua com erro, por não estar chamando o endpoint correto.

## 14 - Altere o formulário HTML criado no passo 6. No elemento <form> indique que o método que deve ser invocado é: action="/lab4/addDomainObject".
Alterando os endpoints dos formulários para "/lab4/addUser" e "/lab4/addSubject", temos o comportamento esperado. Agora, o formulário está realizando a ação correta, chamando os endpoints mapeados pela classe LabController em /lab4.

# Laboratório 5 - Programação Para Internet

## Mudanças
Foi adicionado validação para subject, seguindo as devidas instruções.