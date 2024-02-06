package pe.telefonica.siam.api.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import com.google.gson.Gson;
import pe.telefonica.siam.api.dto.TicketDto;
import pe.telefonica.siam.api.mapper.PageableActiveMapper;
import pe.telefonica.siam.api.mapper.TicketMapper;
import pe.telefonica.siam.domain.entity.TicketEntity;
import pe.telefonica.siam.domain.service.TemplateTicketExcelService;
import pe.telefonica.siam.domain.service.TicketRequestService;
import pe.telefonica.siam.domain.service.TicketService;

@WebMvcTest(controllers = TicketController.class)
@AutoConfigureMockMvc(addFilters = false)
public class TicketControllerApiTest {

	private static final String pathTest = "src/test/resources/ticket";

	@MockBean
	private TicketService ticketService;
	
	@MockBean
	private TicketRequestService ticketRequestService;

	@MockBean
	private PageableActiveMapper pageableActiveMapper;

	@MockBean
	private TicketMapper ticketMapper;

	@MockBean
	private TemplateTicketExcelService templateTicketExcelService;

	@Autowired
	private MockMvc mockMvc;

	TicketEntity ticketEntity;

	@Before
	public void setUp() {
		ticketEntity = new TicketEntity();
	}

	@Test
	@WithMockUser(username = "admin")
	public void test_bad_request_01() throws Exception {
		byte[] bArray = Files.readAllBytes(Paths.get(pathTest, "ticket_vacio.json"));
		this.mockMvc.perform(post("/ticket/high").content(bArray).contentType(MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().isBadRequest())
				.andExpect(
						jsonPath("$['solicitudes[0].solicitudPersona.nombres'][0]", containsString("must not be null")))
				.andExpect(
						jsonPath("$['solicitudes[0].solicitudPersona.celular'][0]", containsString("must not be null")))
				.andExpect(
						jsonPath("$['solicitudes[0].puntoVenta.puntoVentaId'][0]", containsString("must not be null")))
				.andExpect(
						jsonPath("$['solicitudes[0].solicitudPersona.paterno'][0]", containsString("must not be null")))
				.andExpect(
						jsonPath("$['solicitudes[0].solicitudPersona.email'][0]", containsString("must not be null")))
				.andExpect(jsonPath("$['solicitudes[0].solicitudPersona.numDocumento'][0]",
						containsString("must not be null")))

				.andExpect(jsonPath("$['solicitudes[0].solicitudPersona.tipoDocumento.tipoDocumentoId'][0]",
						containsString("must not be null")));

	}

	@Test
	@WithMockUser(username = "admin")
	public void test_bad_request_02() throws Exception {
		byte[] bArray = Files.readAllBytes(Paths.get(pathTest, "ticket_format_invalid.json"));
		this.mockMvc.perform(post("/ticket/high").content(bArray).contentType(MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().isBadRequest())

				.andExpect(jsonPath("$['solicitudes[0].solicitudPersona.celular'][0]",
						containsString("size must be between 0 and 20")))
				.andExpect(jsonPath("$['solicitudes[0].solicitudPersona.materno'][0]",
						containsString("size must be between 0 and 80")))
				.andExpect(jsonPath("$['solicitudes[0].solicitudPersona.paterno'][0]",
						containsString("size must be between 0 and 80")))
				.andExpect(jsonPath("$['solicitudes[0].solicitudPersona.email'][0]",
						containsString("must be a well-formed email address")))
				.andExpect(jsonPath("$['solicitudes[0].solicitudPersona.numDocumento'][0]",
						containsString("size must be between 0 and 20")));
	}

	@Test
	@WithMockUser(username = "admin")
	public void test_createhighTicket_ok() throws Exception {
		byte[] bArray = Files.readAllBytes(Paths.get(pathTest, "ticket_ok.json"));

		TicketDto ticketDto = convert_ticket_dto("ticket_ok.json");
		when(ticketMapper.asTicketEntity(ticketDto)).thenReturn(ticketEntity);
		when(ticketService.createhighTicket(ticketEntity)).thenReturn(ticketEntity);
		when(ticketMapper.asTicketDTO(ticketEntity)).thenReturn(ticketDto);
		this.mockMvc.perform(post("/ticket/high").content(bArray).contentType(MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().isOk());

	}

	@Test
	@WithMockUser(username = "admin")
	public void test_createModificationTicket_ok() throws Exception {
		byte[] bArray = Files.readAllBytes(Paths.get(pathTest, "ticket_ok.json"));

		TicketDto ticketDto = convert_ticket_dto("ticket_ok.json");
		when(ticketMapper.asTicketEntity(ticketDto)).thenReturn(ticketEntity);
		when(ticketService.createModificationTicket(ticketEntity)).thenReturn(ticketEntity);
		when(ticketMapper.asTicketDTO(ticketEntity)).thenReturn(ticketDto);
		this.mockMvc.perform(post("/ticket/modification").content(bArray).contentType(MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().isOk());

	}

	@Test
	@WithMockUser(username = "admin")
	public void test_createshortTicket_ok() throws Exception {
		byte[] bArray = Files.readAllBytes(Paths.get(pathTest, "ticket_ok.json"));

		TicketDto ticketDto = convert_ticket_dto("ticket_ok.json");
		when(ticketMapper.asTicketEntity(ticketDto)).thenReturn(ticketEntity);
		when(ticketService.createshortTicket(ticketEntity)).thenReturn(ticketEntity);
		when(ticketMapper.asTicketDTO(ticketEntity)).thenReturn(ticketDto);
		this.mockMvc.perform(post("/ticket/short").content(bArray).contentType(MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().isOk());

	}

	private TicketDto convert_ticket_dto(String path) throws IOException {
		Gson gson = new Gson();
		Reader reader = Files.newBufferedReader(Paths.get(pathTest, path));
		return gson.fromJson(reader, TicketDto.class);
	}

}
